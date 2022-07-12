package com.spring.aop.exceptions.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("myShape")
public class ShapeService {

    @Autowired
    Square square;

    @Autowired
    Star star;

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square triangle) {
        this.square = square;
    }

    public Star getStar() {
        return star;
    }

    public void setStar(Star star) {
        this.star = star;
    }

}
