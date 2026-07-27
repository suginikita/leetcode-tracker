// Last updated: 7/27/2026, 3:13:04 PM
1import java.util.*;
2
3class Solution {
4    public List<String> fullJustify(String[] words, int maxWidth) {
5        List<String> result = new ArrayList<>();
6        int i = 0;
7
8        while (i < words.length) {
9
10            int lineLength = words[i].length();
11            int j = i + 1;
12            while (j < words.length &&
13                    lineLength + 1 + words[j].length() <= maxWidth) {
14                lineLength += 1 + words[j].length();
15                j++;
16            }
17
18            int numWords = j - i;
19            StringBuilder line = new StringBuilder();
20            if (j == words.length || numWords == 1) {
21
22                line.append(words[i]);
23
24                for (int k = i + 1; k < j; k++) {
25                    line.append(" ");
26                    line.append(words[k]);
27                }
28
29                while (line.length() < maxWidth) {
30                    line.append(" ");
31                }
32
33            } else {
34
35                int totalLetters = 0;
36
37                for (int k = i; k < j; k++) {
38                    totalLetters += words[k].length();
39                }
40
41                int totalSpaces = maxWidth - totalLetters;
42                int gaps = numWords - 1;
43
44                int evenSpaces = totalSpaces / gaps;
45                int extraSpaces = totalSpaces % gaps;
46
47                for (int k = i; k < j; k++) {
48                    line.append(words[k]);
49
50                    if (k < j - 1) {
51
52                        for (int s = 0; s < evenSpaces; s++)
53                            line.append(" ");
54
55                        if (extraSpaces > 0) {
56                            line.append(" ");
57                            extraSpaces--;
58                        }
59                    }
60                }
61            }
62
63            result.add(line.toString());
64            i = j;
65        }
66
67        return result;
68    }
69}