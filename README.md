# StockSyncSlideView
股票列表，横竖联动

![效果](https://github.com/tianchenglin/StockSyncSlideView/blob/main/%E7%B4%A0%E6%9D%90/%E6%95%88%E6%9E%9C.gif)

原理：

​	第一行标题为HorizontalScrollView，内含TextView

​	列表使用RecyclerView，子item中横向滑动也用到HorizontalScrollView

​	HorizontalScrollView与RecyclerView进行双向绑定联动！

​	当标题HorizontalScrollView滑动时，RecyclerView子item的HorizontalScrollView同步滑动

​	当RecyclerView感应到左右滑动时，标题HorizontalScrollView相应滑动。

讲解：

step1:

![step1](https://github.com/tianchenglin/StockSyncSlideView/blob/main/%E7%B4%A0%E6%9D%90/step1.png)

step2:

![step2](https://github.com/tianchenglin/StockSyncSlideView/blob/main/%E7%B4%A0%E6%9D%90/step2.png)

step3:

![step3](https://github.com/tianchenglin/StockSyncSlideView/blob/main/%E7%B4%A0%E6%9D%90/step3.png)

step4：核心

![step4](https://github.com/tianchenglin/StockSyncSlideView/blob/main/%E7%B4%A0%E6%9D%90/step4.png)