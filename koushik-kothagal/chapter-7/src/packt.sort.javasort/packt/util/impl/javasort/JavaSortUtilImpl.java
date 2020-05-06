package packt.util.impl.javasort;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import packt.util.SortUtil;

public class JavaSortUtilImpl implements SortUtil {
    public <T extends Comparable> List<T> sortList(List<T> list) {       
        Collections.sort(list);
        return list;
    }
}