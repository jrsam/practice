import java.util.*;

public class ServerAllocDealloc {

    public static void main(String[] args) {
        String[] input = {"A cdnbox", "A cdnbox", "D cdnbox1","A cdnbox", "A cdnbox", "D cdnbox2", "A cdnbox"};
        List<String> allocatedHosts = new ArrayList<>();
        Tracker tracker = new Tracker();

        for(String value: input) {
            String[] parsed = value.split(" ");
            if(parsed[0].equals("A")) {
                allocatedHosts.add(tracker.allocate(parsed[1]));
            } else if(parsed[0].equals("D")) {
                tracker.deallocate(parsed[1]);
            }
        }

        for(String host: allocatedHosts) {
            System.out.println(host);
        }

    }

    private static class Tracker {

        HashMap<String, List<Integer>> allocatedHosts = new HashMap<>();

        public String allocate(String hostType) {
            int hostNumber = addHost(hostType);
            return hostType+hostNumber;
        }

        private int addHost(String hostType) {
            if(!allocatedHosts.containsKey(hostType)) {
                allocatedHosts.put(hostType, new ArrayList<>(Arrays.asList(1)));
                return 1;
            }

            int i=1;
            for(; i<=allocatedHosts.get(hostType).size(); i++) {
                if(allocatedHosts.get(hostType).indexOf(i) == -1) {
                    allocatedHosts.get(hostType).add(i);
                    return i;
                }

            }
            //1,2,3
            allocatedHosts.get(hostType).add(i);
            return i;
        }

        public void deallocate(String hostName) {

            Integer hostNumber = Character.digit(hostName.charAt(hostName.length()-1), 10) ;
            String hostType = hostName.substring(0, hostName.length()-1);
            allocatedHosts.get(hostType).remove(hostNumber);

        }
    }
}
