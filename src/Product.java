public class Product {
    int width;
    int height;
    Product(int width,int height){
        this.width=width;
        this.height=height;
    }
    int S(){
        return this.width* this.height;
    }
    int V(){
        return (this.width + this.height)*2;
    }
    String display(){
        return "Product{" + width + "; " + height + " }";
    }
}
