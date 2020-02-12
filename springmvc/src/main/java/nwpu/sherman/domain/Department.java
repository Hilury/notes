package nwpu.sherman.domain;

/**
 * 部门实体类
 *
 * @author sherman
 */
public class Department {
    private Integer id;
    private String departmentName;

    public Department() {
    }

    public Department(Integer id, String deptName) {
        this.id = id;
        this.departmentName = deptName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
