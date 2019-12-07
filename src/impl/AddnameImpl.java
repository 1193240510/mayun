package impl;

public class AddnameImpl implements Addname{

    String name;
    @Override
    public String name(String name) {
        this.name=name==null?"没名字":name;

        return name;
    }
}
