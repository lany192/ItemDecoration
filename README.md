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
        implementation 'com.github.lany192:ItemDecoration:1.1.0'
    }
 
#使用
###LinearLayoutManager

    recyclerView.addItemDecoration(new LinearItemDecoration(LinearLayoutManager.HORIZONTAL)
                    .setColor(Color.RED)
                    .setWidth(4));
                    
###GridLayoutManager
    recyclerView.addItemDecoration(new GridItemDecoration()
            .setSpanCount(manager.getSpanCount())
            .setShowBorder(false)
            .setWidth(4)
            .setColor(Color.RED));