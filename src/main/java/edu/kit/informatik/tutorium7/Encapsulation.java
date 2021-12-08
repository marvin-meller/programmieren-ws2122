package edu.kit.informatik.tutorium7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Department {
    private final List<Worker> workers;

    public Department() {
        this.workers = new ArrayList<>();
    }

    public List<Worker> getWorkers() {
        return Collections.unmodifiableList(workers);
    }
}

class Worker {

}