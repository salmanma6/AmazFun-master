package sugoi.android.amazfun;
public class ImageItem {
    private int image;
    private String title;
    private Class cls;
    public ImageItem(int image, String title,Class cls) {
        super();
        this.image = image;
        this.title = title;
        this.cls = cls;
    }
    public Class getCls() {
        return cls;
    }

    public void setCls(Class cls) {
        this.cls = cls;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
