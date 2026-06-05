class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> dictionary = new HashSet<>(wordList);

        if (!dictionary.contains(endWord)) {
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);

        Set<String> visited = new HashSet<>();
        visited.add(beginWord);

        int level = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                String currentWord = queue.poll();

                if (currentWord.equals(endWord)) {
                    return level;
                }

                char[] chars = currentWord.toCharArray();

                for (int pos = 0; pos < chars.length; pos++) {
                    char originalChar = chars[pos];

                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        if (ch == originalChar) {
                            continue;
                        }

                        chars[pos] = ch;
                        String nextWord = new String(chars);

                        if (dictionary.contains(nextWord) && !visited.contains(nextWord)) {
                            visited.add(nextWord);
                            queue.offer(nextWord);
                        }
                    }

                    chars[pos] = originalChar;
                }
            }

            level++;
        }

        return 0;
    }
}