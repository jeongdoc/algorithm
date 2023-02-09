// 520. Detect Capital
/**
 * @param {string} word
 * @return {boolean}
 */
var detectCapitalUse = function(word) {

    word = "BBAEF";

    
    
    for(let i = 0; i < word.length; i ++) {

    }

};

// class Solution {
//     static inline bool isupper(char c) { return !bool(c & 0x20); }
//     static inline bool islower(char c) { return  bool(c & 0x20); }

// public:
//     bool detectCapitalUse(string word) {
//         const auto n{word.size()};
//         if (n <= 1) return true;

//         size_t begin{1};  // Where to start checking letters
//         function<bool(char)> p{isupper};  // Predicate

//         if (isupper(word[0]) && isupper(word[1]))
//             begin = 2, p = islower;

//         for (auto i = begin; i < n; ++i)
//             if (p(word[i]))
//                 return false;

//         return true;
//     }
// };

// class Solution {
//     public:
//         bool detectCapitalUse(string word) {      
//           enum {
//             CAPS  = 1,
//             LOWER = 2,
//             FIRST = 4,
//           };
//           short flag = CAPS | LOWER | FIRST;
//           for (int i = 0; i < word.length(); i++) {
//             char ch = word[i];
//             if (flag & CAPS  && !isupper(ch)) flag ^= CAPS;
//             if (flag & LOWER && !islower(ch)) flag ^= LOWER;
//             if (flag & FIRST) {
//               if (i == 0 && flag & LOWER)     flag ^= FIRST;
//               else if (i > 0 && !islower(ch)) flag ^= FIRST;
//             }
//             if (flag == 0) return false;
//           }
//           return true;
//         }
//     };

detectCapitalUse("2");