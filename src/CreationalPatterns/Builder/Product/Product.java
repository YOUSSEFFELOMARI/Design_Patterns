package CreationalPatterns.Builder.Product;

import java.util.LinkedList;

public class Product {

    private LinkedList<String> parts;

    public Product() {
        this.parts = new LinkedList<>();
    }

    public void add(String part){
        parts.add(part);
    }

    public String Show(){
        StringBuilder res=new StringBuilder();
        res.append("Product components are :\n");
        for (String s: parts) res.append(s).append("\n");

        return res.toString();
    }
}
