package cn.cstor.face;

import java.io.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created on 2016/12/7
 *
 * @author feng.wei
 */
public class FaceCompareLocal {

    private static HashMap baseData = new HashMap<Float[], String>();
    private static ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap<Double, Float>();
    private static List<FaceEntity> faceList = Collections.synchronizedList(new ArrayList<FaceEntity>());
    private static List<FaceEntity> baseList = new ArrayList<FaceEntity>();

    public static void main(String[] args) throws IOException, InterruptedException {

        String id = "0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0165373 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00383901 0.0 0.0 0.0 0.0 0.0264382 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00833338 0.0 0.0441109 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0337005 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00384925 0.0 0.0 0.0 0.0 0.0 0.0 0.0319813 0.0 0.0 0.0 0.0 0.0 0.0412182 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00540992 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00238196 0.0 0.0 0.0 0.0 0.0324364 0.0 0.0 0.0 0.0 0.00730646 0.0 0.0 0.0 0.0 0.030211 0.0 0.0 0.0 0.0 0.0 0.0023353 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00398723 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0131643 0.0 0.0 0.0 0.0 0.0 0.0 0.0510385 0.0 0.00831759 0.0 0.0 0.0 0.0 0.0 0.0 0.019022 0.0 0.0 0.0 0.0 0.0386362 0.0 0.0388773 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0298353 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00935792 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0194582 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0159986 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00212799 0.0 0.0 0.0 0.0291201 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0373666 0.0 0.0 0.0 0.0 0.0 0.0218643 0.0 0.0 0.0 0.0 0.0 0.0 0.0111407 0.0183081 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00126857 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0140005 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0106918 0.0 0.0 0.0 0.0 0.0 0.0350879 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0110905 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0480313 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00752294 0.0 0.0129714 0.0381233 0.0 0.0 0.0 0.0 0.0 0.0 0.00177493 0.0182744 0.0 0.00995543 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00334241 0.0 0.0 0.0 0.0 0.0117622 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0689841 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0123712 0.0 0.0 0.0 0.0 0.0 0.0133678 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0733421 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0141895 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0102503 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0364621 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0439864 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0107153 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00480682 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0028553 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0380624 0.0 0.0 0.0 0.0756711 0.0 0.0 0.0 0.00367933 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0238719 0.0 0.0 0.0 0.0 0.0 0.0 0.0285215 0.0 0.0 0.0 0.0 0.0103172 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00569721 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00894036 0.0316997 0.0 0.00116013 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0226148 0.0 0.0 0.0 0.0 0.0665689 0.0110856 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0251832 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0332844 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0197123 0.0 0.0 0.0157735 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0375734 0.0 0.0 0.0 0.0 0.0 0.00552679 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00330772 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.017086 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0061253 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0145224 0.0 0.0 0.0 0.0 0.0 0.0340223 0.000680213 0.0 0.0 0.0 0.0 0.0 0.0 0.0224467 0.0 0.0040564 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0114564 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.000609755 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0148466 0.0 0.0 0.0 0.0 0.0 0.0 0.00800984 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0955815 0.0 0.0 0.0 0.0 0.0 0.0166994 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0138368 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0218361 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.006412 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00372705 0.0 0.0 0.0 0.0670653 0.0 0.0 0.0 0.0 0.0513101 0.0 0.0229288 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00886058 0.00165356 0.0 0.0 0.0 0.026039 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0030685 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00530955 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0202157 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0512285 0.0032311 0.0 0.0 0.0230723 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0369519 0.0 0.0 0.0 0.0 0.0 0.0 0.0178436 0.0 0.0 0.0 0.0 0.0 0.0631211 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0462136 0.0 0.0 0.0 0.010553 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00981957 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.069224 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0169357 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0367383 0.0 0.0 0.0302248 0.0 0.0 0.0 0.0 0.039263 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0128259 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0251692 0.0 0.0 0.0 0.0 0.0 0.0 0.0172769 0.0269837 0.0 0.0 0.018632 0.0 0.0 0.0 0.0 0.0 0.0431052 0.0 0.0 0.0 0.0 0.0100962 0.0 0.0 0.00903872 0.0 0.0 0.0 0.0 0.0 0.0 0.0174635 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0203126 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0201795 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0192759 0.0 0.0 0.00528529 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0622255 0.0 0.0815153 0.0 0.0 0.0574222 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00238562 0.0 0.0 0.0 0.0 0.0 0.0 0.0017317 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00805104 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0206555 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0174983 0.0 0.0 0.0 0.0 0.0 0.0497367 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0585417 0.0 0.0 0.0 0.0 0.0340368 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0472189 0.0 0.0 0.0 0.0 0.0268678 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0188142 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.000636584 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0292648 0.0 0.0 0.0 0.0113326 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00303866 0.0 0.0 0.000238577 0.0 0.0 0.0 0.0 0.0248511 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0232327 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0603445 0.0143774 0.0 0.0 0.0 0.0 0.0 0.00342231 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0140168 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00346853 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0341653 0.0411301 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00375618 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0326706 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00884021 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.048467 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00491195 0.0 0.0 0.0 0.0 0.0 0.0137367 0.0 0.0 0.0 0.042443 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0710595 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00384034 0.0 0.0 0.0 0.0740189 0.0 0.00588951 0.0 0.0 0.0 0.0 0.0 0.0 0.0128247 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.000332809 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0202416 0.00864437 0.0 0.0 0.0106603 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00190297 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 3.56308e-05 0.0 0.0 0.0 0.0 0.0308486 0.0 0.0 0.0 0.0 0.0 0.0540083 0.0 0.0 0.0072574 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0252153 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0125194 0.0 0.0 0.0 0.0 0.0 0.0175964 0.0 0.0 0.0286467 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0222187 0.0 0.0 0.0 0.0 0.0 0.0 0.0251773 0.0 0.0 0.0 0.0182963 0.0 0.0 0.0 0.0 0.0 0.0133224 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0141606 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00841619 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0154958 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0372686 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0142837 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0155161 0.0 0.0 0.0 0.0 0.0 0.0161678 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0193042 0.0 0.018607 0.0 0.00258105 0.0 0.0 0.0131636 0.0 0.0 0.0 0.0263094 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00139552 0.030787 0.0 0.0 0.0 0.0 0.0 0.0 0.00283233 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0399193 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0141426 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0420874 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0145164 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0312264 0.0 0.0 0.0114864 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0295532 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.020472 0.0 0.0 0.0 0.0 0.0 0.0 0.0204131 0.00239875 0.0 0.0 0.0 0.0510137 0.0 0.0 0.0 0.0 0.0220291 0.0 0.0 0.0 0.0 0.0 0.0 0.00538331 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00767546 0.0 0.0 0.0 0.0 0.0 0.0221672 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0161901 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00619786 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0116555 0.0 0.0 0.0 0.0 0.0019309 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00199499 0.0491934 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00327069 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0170544 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0130967 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.031659 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0146893 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0325575 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0146722 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0271257 0.0 0.0 0.0185083 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.012734 0.0 0.0 0.0 0.0 0.0 0.0267481 0.0 0.0 0.0176558 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.022179 0.0 0.0 0.00224855 0.0 0.00839989 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0343503 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0168146 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0194723 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00904731 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00123285 0.00582742 0.0 0.0 0.0 0.0 0.000177618 0.0 0.0 0.0 0.0 0.0322638 0.0 0.0 0.0 0.0 0.0 0.0100713 0.0 0.00408104 0.0 0.0 0.0 0.0 0.0 0.0211654 0.00624582 0.0 0.0 0.0 0.0 0.0 0.00919202 0.00700447 0.00573854 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00248979 0.0386599 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0131433 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0175896 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0181481 0.0 0.0174803 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0125192 0.0 0.0 0.0 0.0610551 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0231139 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00429968 0.0 0.0 0.0 0.0 0.0 0.0 0.0146962 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0339234 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00798099 0.0293605 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00864015 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0523839 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00355627 0.0 0.0 0.00619564 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00491442 0.0 0.00117349 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0182195 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00569346 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0011713 0.00101754 0.00907138 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0034428 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00383041 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0307627 0.0 0.0 0.0 0.0 0.00992857 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0306098 0.0 0.0 0.0 0.0349083 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00635888 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0557236 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00203583 0.0 0.0 0.0 0.00537782 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0155609 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0151904 0.0 0.0382282 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0579791 0.0 0.0173293 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0099249 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00982567 0.0 0.0 0.0 0.0413356 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0166891 0.0387106 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.000742049 0.0 0.0 0.0141543 0.0 0.0 0.0 0.0 0.0 0.0 0.000535615 0.0 0.0 0.0 0.016992 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0157476 0.0 0.0 0.0147964 0.0 0.0 0.0602125 0.0 0.00807471 0.01961 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0193449 0.0 0.0 0.0 0.0 0.0 0.0250828 0.0 0.0 0.0 0.0 0.0 0.0 0.00375677 0.0 0.0 0.0 0.0478912 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00204081 0.0 0.0 0.0 0.0 0.000613522 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0244027 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.024044 0.0134395 0.0405269 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0125556 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00812485 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.000303588 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0337387 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00394467 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0201382 0.0 0.0163239 0.0 0.0 0.0 0.0 0.0028071 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.051074 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00316758 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0200185 0.0 0.0 0.00138684 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0234875 0.0 0.0038533 0.0 0.0 0.0 0.0 0.103305 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0384289 0.0 0.0 0.0 0.00973446 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00431496 0.0 0.0 0.0 0.0 0.0 0.000580609 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00158174 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0180662 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.00552316 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0";
        loadFile("data/features_12k.txt");
        System.out.println(baseData.size());

        long t3 = System.currentTimeMillis();

        Float[] floats = transfer2Flaot(id);
        System.out.println("single lenght=" + floats.length);

//        compare(floats);

        multiThreadCompare(floats, 1);
        Collections.sort(faceList);

        System.out.println("faceList size=" + faceList.size());
        System.out.println("max rate=" + faceList.get(0).getRate() + " ,address=" + faceList.get(0).getAddress());
        long t4 = System.currentTimeMillis();
        System.out.println("t4 - t3=" + (t4 - t3));
    }

    public static Float[] transfer2Flaot(String id) {
        String[] els = id.split(" ");
        Float[] floats = new Float[els.length];
        for (int i = 0; i < els.length; i++) {
            floats[i] = Float.valueOf(els[i]);
//                System.out.print(floats[i] + " ");
        }
        return floats;
    }

    public static void compare(Float[] floats) {

        long t1 = System.currentTimeMillis();
        Iterator<Map.Entry<Float[], String>> iter = baseData.entrySet().iterator();
        int len = 4096;
        Double rate = 0.0;
        String address = "";
        while (iter.hasNext()) {
            Map.Entry<Float[], String> entry = iter.next();
            Double denominator = 0.0;
            Float den1 = 0f;
            Float den2 = 0f;
            Float member = 0f;
            Float[] id_base = entry.getKey();
            for (int i = 0; i < len; i++) {
                member += id_base[i] * floats[i];
                den1 += id_base[i] * id_base[i];
                den2 += floats[i] * floats[i];
            }
            denominator = Math.sqrt(den1) * Math.sqrt(den2);
            Double rate_tmp = member / denominator;
//            System.out.println("rate_tmp=" + rate_tmp);
            if (rate < rate_tmp) {
                rate = rate_tmp;
                address = entry.getValue();
            }

            FaceEntity faceEntity = new FaceEntity();
            faceEntity.setRate(rate_tmp);
            faceEntity.setAddress(entry.getValue());
            faceList.add(faceEntity);
//            System.out.println("rate=" + rate);
        }
        long t2 = System.currentTimeMillis();
        System.out.println("rate=" + rate + " , address=" + address);
        System.out.println("t2 - t1 = " + (t2 - t1) + " ,basedata size=" + baseData.size());
    }

    public static void multiThreadCompare(final Float[] floats, int threadNum) throws InterruptedException {
        final int len = floats.length;
        int baseSize = baseList.size();
        final int range = baseSize / threadNum;
        List<Thread> threads = new ArrayList<Thread>();
        for (int i = 0; i < threadNum; i++) {
            final int n = i;
            Thread myThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = n * range; j < (n * range + range); j++) {
                        FaceEntity faceEntity = baseList.get(j);
                        for (int k = 0; k < len; k++) {
                            Double denominator = 0.0;
                            Float den1 = 0f;
                            Float den2 = 0f;
                            Float member = 0f;
                            Float[] id_base = faceEntity.getFloats();
                            for (int i = 0; i < len; i++) {
                                member += id_base[i] * floats[i];
                                den1 += id_base[i] * id_base[i];
                                den2 += floats[i] * floats[i];
                            }
                            denominator = Math.sqrt(den1) * Math.sqrt(den2);
                            Double rate_tmp = member / denominator;
                            FaceEntity reEntity = new FaceEntity();
                            reEntity.setRate(rate_tmp);
                            reEntity.setAddress(faceEntity.getAddress());
                            faceList.add(reEntity);
                        }
                    }
                }
            });

            threads.add(myThread);
            myThread.start();

        }

        for (Thread thread : threads){
            thread.join();
        }
    }

    public static void loadFile(String path) throws IOException {
        String encoding = "utf8";
        File file = new File(path);
        InputStreamReader read = new InputStreamReader(
                new FileInputStream(file), encoding
        );
        BufferedReader bufferedReader = new BufferedReader(read);

        String line = null;

        while ((line = bufferedReader.readLine()) != null) {
            String[] id_addr = line.split("#");
            String[] els = id_addr[0].split(" ");
            Float[] floats = new Float[els.length];
            for (int i = 0; i < els.length; i++) {
                floats[i] = Float.valueOf(els[i]);
//                System.out.print(floats[i] + " ");
            }
//            System.out.println("addr=" + id_addr[1]);
//            System.out.println("===========================");
            // baseData.put(floats, id_addr[1]);
            FaceEntity faceEntity = new FaceEntity();
            faceEntity.setAddress(id_addr[1]);
            faceEntity.setFloats(floats);
            baseList.add(faceEntity);
        }


    }

}
