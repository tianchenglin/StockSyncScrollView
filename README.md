# StockSyncSlideView
股票列表，横竖联动

![效果](https://github.com/tianchenglin/StockSyncSlideView/blob/main/imgs/ys.gif)

原理：

​	第一行标题为HorizontalScrollView，内含TextView

​	列表使用RecyclerView，子item中横向滑动也用到HorizontalScrollView(注：为避免item中的HorizontalScrollView与RecyclerView滑动冲突，此处我们拦截掉子item中的HorizontalScrollView的事件，我们自己来处理RecyclerView上下滑动或左右滑动)

​	HorizontalScrollView与RecyclerView进行双向绑定联动！

​	当标题HorizontalScrollView滑动时，RecyclerView子item的HorizontalScrollView同步滑动

​	当RecyclerView感应到左右滑动时，标题HorizontalScrollView相应滑动。

讲解：

step1:

![step1](https://github.com/tianchenglin/StockSyncSlideView/blob/main/imgs/step1.png)

step2:

![step2](https://github.com/tianchenglin/StockSyncSlideView/blob/main/imgs/step2.png)

step3:

![step3](https://github.com/tianchenglin/StockSyncSlideView/blob/main/imgs/step3.png)

step4：核心

![step4](https://github.com/tianchenglin/StockSyncSlideView/blob/main/imgs/step4.png)