[![](https://jitpack.io/v/lany192/ItemDecoration.svg)](https://jitpack.io/#lany192/ItemDecoration)

# ItemDecoration
    
    这是一个简单易用的分割线库，可以使用默认值，也可以很方便的设置样式。目前只支持纯色分割线的设置，不支持Drawable
    
# 引用
    allprojects {
        repositories {
            ...
            maven { url 'https://jitpack.io' }
        }
    }
#  
    dependencies {
        implementation 'com.github.lany192:ItemDecoration:1.1.6'
    }
 
# 使用
### LinearLayoutManager

    recyclerView.addItemDecoration(new LinearItemDecoration(LinearLayoutManager.HORIZONTAL)
                    .setColor(Color.RED)
                    .setWidth(4));
                    
### GridLayoutManager
    recyclerView.addItemDecoration(new GridItemDecoration()
            .setSpanCount(manager.getSpanCount())
            .setShowBorder(false)
            .setWidth(4)
            .setColor(Color.RED));

### 不同item使用不同的分割线，复现getDivider(int itemPosition)

        recyclerView.addItemDecoration(new ItemDecoration() {

            @Override
            public Divider getDivider(int itemPosition) {
                Divider divider = null;
                if ((itemPosition >= 1 && itemPosition <= 6) || itemPosition == 9 || itemPosition == 10) {
                    divider = new Divider.Builder()
                            .setBottom(Color.BLACK, 6)
                            .build();
                } else if (itemPosition == 0 || itemPosition == 7 || itemPosition == 8) {
                    divider = new Divider.Builder()
                            .setRight(Color.BLACK, 6)
                            .setBottom(Color.BLACK, 6)
                            .build();
                } else if (itemPosition > 10 && itemPosition < 22) {
                    switch ((itemPosition - 10) % 4) {
                        case 1:
                        case 2:
                        case 3:
                            divider = new Divider.Builder()
                                    .setRight(Color.BLACK, 6)
                                    .setBottom(Color.BLACK, 6)
                                    .build();
                            break;
                        case 0:
                            divider = new Divider.Builder()
                                    .setBottom(Color.BLACK, 6)
                                    .build();
                            break;
                        default:
                            break;
                    }
                }
                return divider;
            }

        });
