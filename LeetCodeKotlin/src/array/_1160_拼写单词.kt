package array

/**
 * url:
 * Author:Savannah
 * Description:
 * LeetCodeTesting 9/25/20
 */
class _1160_拼写单词 {
    fun countCharacters(words: Array<String>, chars: String): Int {
        var arr = IntArray(26)
        var c = chars.toCharArray()

        c.forEachIndexed { index, c ->
            ++arr[c-'a']
        }
        var sum = 0
        words.forEach { it->
            var ok = true

            var c1 = it.toCharArray()
            var l = it.length
            c1.forEachIndexed { index, c ->

                if(arr[c1[index]-'a']==0){
                    ok = false
                }
            }
            if(ok){
                sum+=l
            }
        }
        return sum
    }
}