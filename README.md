# ImageLoader-Assignment.

This Project is an example of Loading Images asynchronously in a listview from Web and Caching.

MainActivity just stores the web links of images and calls the listview and its adapter.

LazyAdapter extends the BaseAdapter and inflates the layout and calls the ImageLoader and displays the Image.

ImageLoader: Using DisplayImage(Url, ImageView) method of ImageLoader class, we can load and cache image.
             We just need to provide the web url of image and the imageview in which you want to display loaded image.

Utils deals with the Input and Output streams.

FileCache: In this file, we create TTImages_cache folder for caching images into it.
           Also to load image if synced already. We can use clear() method of FileCache class to clear synced images.
           
MemoryCache: This file deals with LRU Caching and uses 25% of available heap size.
