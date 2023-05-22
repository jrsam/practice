package problemSolving;

public class Builder {
    public static void main(String[] args) {
        CPU cpuBuilded = CPU.builder().withRam("super ram")
                .withHdd("super jdd")
                .build();
        System.out.println(cpuBuilded);
    }
}
class CPU {
    String ram;
    String hdd;

    @Override
    public String toString() {
        return "CPU{" +
                "ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                '}';
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    private void setHdd(String hdd) {
        this.hdd = hdd;
    }
    static CPUBuilder builder() {
        return new CPUBuilder();
    }

    public static class CPUBuilder {
        String ram;
        String hdd;

        public CPUBuilder withRam(String ram) {
            this.ram = ram;
            return this;
        }

        public CPUBuilder withHdd(String hdd) {
            this.hdd = hdd;
            return this;
        }

        CPU build() {
            CPU cpu = new CPU();
            cpu.setRam(ram);
            cpu.setHdd(hdd);
            return cpu;
        }
    }

}


