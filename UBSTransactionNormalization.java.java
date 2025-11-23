import java.util.*;
import java.io.*;

public class UBSTransactionNormalization {

 static class Txn {
 String txnId, userId;
 int amount;
 long timestamp;

 Txn(String t, String u, int a, long ts) {
 this.txnId = t;
 this.userId = u;
 this.amount = a;
 this.timestamp = ts;
 }

 @Override
 public String toString() {
 return txnId + " " + userId + " " + amount + " " + timestamp;
 }
 }

 public static void main(String[] args) throws Exception {

 Scanner sc = new Scanner(System.in);
 int n = Integer.parseInt(sc.nextLine());

 Map<String, Txn> map = new HashMap<>();

 for (int i = 0; i < n; i++) {
 String[] arr = sc.nextLine().split(" ");
 String t = arr[0];
 String u = arr[1];
 int a = Integer.parseInt(arr[2]);
 long ts = Long.parseLong(arr[3]);

 String key = t + "_" + u + "_" + a;

 if (!map.containsKey(key)) {
 map.put(key, new Txn(t, u, a, ts));
 } else {
 Txn old = map.get(key);
 if (ts < old.timestamp) {
 old.timestamp = ts;
 }
 }
 }

 List<Txn> list = new ArrayList<>(map.values());

 list.sort((a, b) -> {
 if (a.timestamp != b.timestamp) return Long.compare(a.timestamp, b.timestamp);
 return a.txnId.compareTo(b.txnId);
 });

 for (Txn t : list) System.out.println(t);
 }
}
