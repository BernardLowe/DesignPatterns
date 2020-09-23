package aidd.builder;

/**
 * 〈抽象建造者〉
 *
 * @author jeachin
 * @create 2020/9/1
 */
public abstract class Builder {
    //创建产品对象
    protected Product product=new Product();
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();
    //返回产品对象
    public Product getResult()
    {
        return product;
    }
}
