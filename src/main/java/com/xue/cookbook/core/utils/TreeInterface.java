package com.xue.cookbook.core.utils;

import java.util.Set;

public interface TreeInterface {
    Long getId();

    Long getPid();

    void setChildren(Set<TreeInterface> children);

    Set<TreeInterface> getChildren();
}