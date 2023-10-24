fun main() {
//     you can write a single lambda method separately, but a better way is to write it in the maxBy() method
//    val lam = {one:String->
//        one.length
//    }

    val list = listOf("1", "111", "err", "werwwe", "ewrewefef")

    // maxBy API
//    val max_length_element = list.maxBy(lam) // original way
    val maxLengthElement = list.maxBy { it.length } // better way
    println(maxLengthElement)

    // map API
    val newMapList = list.map { it[0] }
    println(newMapList)

    // filter API
    val newFilterList = list.filter { it.length<=3 }
    println(newFilterList)

    // JAVA ����ʽAPI����kl���������һ��java�������÷�������һ��java�����󷽷��ӿڲ����������ʹ�ú���ʽAPI
    /*
     ���磬 ����¼��ӿڣ�
    public interface OnClickListener {
        void onClick(View v);
    }
    ����һ�������󷽷��ӿڣ������һ��java������Ҫ�������󷽷��ӿڣ��Ҳ����б��еĵ����󷽷��ӿ�ֻ����һ���������ʹ�ú���ʽAPI�����磺
    button.setOnClickListener(new View.OnClickListener(){
        @override
        public void click(View v){
            ...
        }
    }
    �Ϳ��Ա�ɣ�
    button.setOnClickListener{
        ...
    }
    1. �����󷽷��ӿ�ֻ��һ�����󷽷������Կ���ʡ�Ժ�����ֱ��ʵ�ֺ�����
    2. java�����в���ֻ����һ�������󷽷��ӿڲ����������ʡ�Խӿ���
    3. java��������Ҫ�����Ĳ����������ʡ��С���ţ�ֻ����������д�ӿڵĳ��󷽷�������

     */
}