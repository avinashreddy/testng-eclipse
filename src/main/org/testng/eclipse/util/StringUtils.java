package org.testng.eclipse.util;

import org.testng.eclipse.collections.Lists;

import java.util.Collection;
import java.util.List;

public class StringUtils {

  public static List<String> stringToList(String s) {
    String[] a = s.split("[ ]+");
    List<String> result = Lists.newArrayList();
    for(int i = 0; i < a.length; i++) {
      if(a[i].trim().length() > 0) {
        result.add(a[i]);
      }
    }
  
    return result;
  }

  /**
   * Splits a space separated string into token and returns <tt>null</tt> if the string
   * is empty.
   */
  public static List<String> stringToNullList(final String s) {
    List<String> result = stringToList(s);
    
    return result.isEmpty() ? null : result;
  }

  public static boolean isEmptyString(String content) {
    return null == content || content.trim().length() == 0;
  }

  public static String listToString(Collection<String> l) {
    StringBuffer result = new StringBuffer();
  
    if(null != l) {
      for (String s : l) {
        result.append(s).append(" ");
      }
    }
  
    return result.toString().trim();
  }

}
