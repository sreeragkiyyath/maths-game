/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import java.io.Serializable;

public class Record implements Serializable, Common {

    public int count = 0;

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}
