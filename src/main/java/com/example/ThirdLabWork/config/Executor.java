package com.example.ThirdLabWork.config;

import com.example.ThirdLabWork.viewer.Viewer;

import java.util.List;

public class Executor {

    private List<Viewer> viewerList;

    public Executor(List<Viewer> viewerList) {
        this.viewerList = viewerList;
    }

    public void execute() {
        for (Viewer v: viewerList) {
            v.getSurface().illuminate();
            System.out.println(v);
        }
    }

    @Override
    public String toString() {
        return "Executor";
    }
}
