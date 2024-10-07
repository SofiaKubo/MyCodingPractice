package funcstyle;

import java.util.Objects;

public class Task {
    private Integer id;
    private String name;
    private String description;

    public Task(Integer id) {
        this.id = id;
    }

    public Task(Integer id, String name, String description) {
        this.name = name;
        this.id = id;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description);
    }

    @Override
    public String toString() {
        return " id = '" + id + '\'' +
                ", name = '" + name + '\'' +
                ", description = '" + description + '\'';
    }
}
