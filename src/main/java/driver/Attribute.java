package driver;

import org.apache.commons.lang.mutable.MutableBoolean;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by 12100888 on 07/11/2016.
 */
public class Attribute implements Serializable {

    private final String name;
    private final MutableBoolean isContinuous = new MutableBoolean();

    public Attribute(String name){
        this.name = name;
    }

    public Attribute(String name, boolean isContinuous){
        this.name = name;
        this.isContinuous.setValue(isContinuous);
    }

    public String getName(){
        return this.name;
    }

    public boolean isContinuous(){
        return this.isContinuous.booleanValue();
    }
}
