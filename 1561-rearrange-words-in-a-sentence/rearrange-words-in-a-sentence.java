class Solution {
    public String arrangeWords(String text) {
        text = Character.toLowerCase(text.charAt(0)) + text.substring(1);

        TreeMap<Integer, List<String>> map = new TreeMap<>();

        String[] arr = text.trim().split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i].length())) {
                map.put(arr[i].length(), new ArrayList<>());
            }
            map.get(arr[i].length()).add(arr[i]);
        }

        StringBuilder sb = new StringBuilder();

        for (int x : map.keySet()) {
            List<String> l = map.get(x);
            for (int j = 0; j < l.size(); j++) {
                sb.append(l.get(j)).append(" ");
            }
        }

        sb.deleteCharAt(sb.length() - 1);
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));

        return sb.toString();
    }
}