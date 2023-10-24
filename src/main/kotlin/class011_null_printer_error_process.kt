/**
 * ��kotlin�У���������Ĭ�϶���Ϊnullֵ�����������Ҫ��nullֵ����Ҫ���ÿɿ�����ϵͳ
 * ������˵���������ͺ����һ���ʺż��ɣ�������
 */

var globalStr :String? = null

fun main() {
    getLength(null)
}

/**
 * 1. str: String?
 * ��ʱʹ���ʺż������ô�����ʵ��Ϊnull����ͬʱ�������ڲ��漰������str�ķ����ĵط�����Ҫ��if str!=null����
 * ��Ȼ�ᱨ��
 */
fun getLength(str: String?): Int {
    if (str != null) {
        return str.length
    } else {
        return 0
    }
}

/**
 * 2. a?.doSomething()
 * ��ʱ��Ա���a�����жϣ����a��Ϊ�ղ�ִ�к���ķ�����Ϊ����ִ�С�
 */
fun testADoSomething(a: String?): Int? {
    return a?.length
}

/**
 * 3. a ?: b
 * ��ʱ�����ж�a�Ƿ�Ϊ�գ���Ϊ���򷵻�a��ֵ�����򷵻�b��ֵ
 * ���Խ��a?.doSomething()һ��ʹ�ã����涨aΪ��ֵʱҪִ�е����
 * �ܶ���֮��ͨ��?.���涨a��Ϊ��ʱ�Ĳ�����ͨ��?:���涨aΪ��ʱ�Ĳ���
 */
fun testAOrB(a: String?): Int {
    return a?.length ?: 0
}

/**
 * 4. a!!.doSomething()
 * �ǿն��ԣ��Լ��ǳ�ȷ�Ŵ˴�����Ϊ�ղż���
 */
fun testNOTNULL(a: String?) {
    println(a!!.length)
}

/**
 * 5. a?.let{obj->...}
 * let�������ǰ�������ȥ��Ϊobj����ִ�к����
 * �������ĺô��ǲ���Ҫд����a?.�ˣ�ֻ��Ҫ�ж�һ�μ���ִ�к����let
 */
fun testLetMethod(a: String?) {
    // ��ǰ��д��
    a?.length
    a?.get(0)

    // ����ʹ��let��
    a?.let {
        it.length
        it[0]
    }
}

/**
 * ����һ�㣬���ʹ��if��ȫ�ֱ����пգ����ǻᱨ����Ϊ��ʱ�������������̸ı�ȫ�ֱ�����ֵ���������գ���ʹ��let�򲻻��д�����
 */
fun testLetGlobal(){
//    if(globalStr != null){
//        val length = globalStr.length // Error: Smart cast to 'String' is impossible, because 'globalStr' is a mutable property that could have been changed by this time
//        val c = globalStr[0] // Error: Smart cast to 'String' is impossible, because 'globalStr' is a mutable property that could have been changed by this time
//    }
}