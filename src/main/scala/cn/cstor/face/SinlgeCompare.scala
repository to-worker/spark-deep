package cn.cstor.face

/**
  * Created on 2016/12/16
  *
  * @author feng.wei
  */
object SinlgeCompare {

    def main(args: Array[String]) {
        val ds1 = "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00157717 0 0 0 0 0 0 0 0 0 0.000277981 0 0.00223215 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00115231 0 0 0 0 0.000144632 0 0 0 0 0 0 0 0.00889328 0 0 0 0 0 0 0 0 0.00800938 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00453474 0 0 0 0 0 0.00738537 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00159885 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00204789 0 0 0 0 0 0 0.0114453 0 0.0039678 0.00745027 0 0 0 0 0 0 0 0 0 0.00379821 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00056203 0 0 0.00184006 0 0 0 0 0 0 0 0.000351171 0 0 0.00494892 0 0 0 0 0 0 0 0 0 0 0 0.00966921 0 0 0 0.00072476 0 0 0.0010625 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00121191 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00430919 0 0 0 0.00637901 0.00313489 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0069889 0 0 0 0 0 0 0 0 0 0 0.00274478 0 0 0 0 0.0107637 0.00649025 0.0028052 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00139378 0 0 0 0 0 0.0152139 0 0 0 0 0.0290875 0 0 0 0 0 0.00388097 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00812787 0 0 0 0 0 0.00436501 0 0 0 0 0 0.0082904 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00636588 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00244675 0 0 0 0.00491504 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.000329542 0.000167328 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00353421 0 0 0 0.00343463 0 0 0 0 0 0 0 0 0.00125219 0 0 0 0 0 0 0 0 0 0 0 0.0122962 0 0 0 0.00821065 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00821033 0.00131144 0 0 0 0 0 0.00172199 0 0 0.00461654 0 0.00278688 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1.04955e-05 0 0 0 0 0 0 0 0 0 0 0 0.0117956 0 0 0 0 0 0 0 0.00366694 0 0 0 0.0137501 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0105637 0 0 0 0 0.0270411 0 0 0.00579488 0 0 0 0 0 0 0 0 0 0 0 0.00384624 0 0 0 0 0 0 0.00822764 0 0 0.00711704 0 0 0 0 0.00379867 0 0 0 0 0 0 0 0 0 0.00295603 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00229005 0.00125113 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00921421 0 0 0 0 0 0 0.00725012 0 0 0 0 0.00046549 0.000556917 0 0 0 0 0 0.00544646 0 0 0 0 0 0 0 0 0.00176198 0.00335404 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0059776 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00908608 0 0 0 0 0 0 0.000435325 0.00562641 0.00620358 0 0 0 0.00905806 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00337216 0 0 0 0 0 0.00139156 0 0 0 0 0 0 0 0 0 0.00281686 0.001655 0 0 0.0108969 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00526537 0 0.0159216 0 0 0 0 0 0 0 0 0 0 0 0 0.00413589 0 0 0 0 0 0 0 0 0 0.00107084 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.000489068 0 0.00485349 0 0 0 0 0 0.00421665 0 0 0 0 0 0 0 0 0.000445731 0.00740536 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00385615 0 0 0 0 0.0146533 0 0.00810943 0 0 0 0.00484134 0 0 0 0 0 0 0 0 0.00373509 0 0 0 0 0 0 0 0 0.0231228 0 0 0 0 0 0 0 0 0.00128895 0 0.00147386 0 0 0 0 0 0 0 0 0.0117572 0.00410519 0.011547 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0158657 0 0 0 0 0 0 0 0 0 0.00377247 0 0 0 0 0 0 0 0 0 0.000819063 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00123064 0 0.00277129 0 0 0 0 0 0 0 0.0119916 0 0 0 0 0 0.00898298 0 0 0 0.00215792 0 0 0 0.0084257 0 0 0 0 0.00376187 0 0 0 0 0 0 0 0 0.00451973 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.000858941 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00268697 0 0 0 0 0 0.0131766 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00165421 0 0 0 0 0 0.011297 0 0 0 0 0 0 0 0 0 0.00242397 0 0 0 0 0 0.000429913 0 0 0 0 0 0 0 0 0 0 0 0.0129507 0 0 0 0.000596431 0.00528241 0 0 0 0 0 0.0111433 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00304481 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0182804 0 0.000966377 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0198611 0.0121865 0 0.00396628 0 0 0 0 0.0119261 0 0 0.00634547 0 0 0 0.00721989 0.0144048 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.014303 0 0 0 0 0 0 0 0 0.00362113 0 0.0146963 0 0 0 0 0.00679803 0 0 0 0 0 0 0 0 0.0107235 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0107445 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.000104838 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0135146 0 0 0 0.00331045 0 0 0 0 0 0 0 0.00156362 0 0 0 0 0 0 0 0 0 0.00452046 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.000386852 0 0 0 0 0 0 0.00383578 0 0 0 0 0 0 0 0 0 0 0.00284943 0.00434641 0 0 0 0 0 0 0 0 0 0 0 0.000463041 0.00896108 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0033498 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00213312 0 0 0.000427888 0 0 0 0 0 0 0 0.00177134 0 0 0 0 0 0 0 0 0 0.00432879 0 0 0 0 0 0 0 0 0 0.0142195 0 0 0 0 0.0105238 0 0 0.00871134 0 0 0 0 0 0 0 0 0 0 0 0 0 4.68025e-05 0 0 0 0 0 0 0 0 0.0149102 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00106237 0 0 0 0 0.00435155 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0116927 0 0 0 0.00335547 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0182849 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0011578 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00247635 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00383223 0 0 0 0 0 0 0.00610143 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.014878 0.00743214 0 0 0 0.0136365 0.0115488 0 0 0 0 0 0 0 0 0 0 0 0.00194547 0 0 0 0 0 0 0 0 0 0.0235392 0 0 0 0.023275 0 0 0 0 0.000762475 0 0 0 0 0 0 0 0 0 0.00590039 0 0 0 0.00487353 0 0.00543321 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00607157 0 0.00324527 0 0 0 0 0.0164827 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00288742 0 0 0 0 0.0113662 0 0 0 0 0 0 0 0 0 0 0.002865 0.00850267 0 0 0 0 0 0 0 0.00147092 0 0 0 0 0 0 0 0 0 0 0 0 0.00322494 0 0 0 0 0 0 0 0 0 0 0 0 0.0127387 0 0 0 0 0 0 0.00325956 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00491068 0 0 0 0 0 0.00303218 0 0 0 0 0 0 0 0 0 0.00158604 0 0 0 0 0 0 0 0 0 0.00451391 0 0 0 0 0 0 0.0102951 0 0.00470687 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00479692 0 0 0 0 0 0.0260572 0 0 0 0 0 0 0 0 0 0 0 0 0 0.000601595 0 0 0 0 0 0 0 0 0 0 0 0 0.00695603 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00384896 0 0 0 0.00823943 0 0 0.000902557 0 0 0 0.00684276 0 0 0 0.000213914 0 0 0.0128857 0 0 0 0 0 0 0 0 0 0 0 0 0.00341205 0 0 0 0.000839593 0 0 0 0.0143841 0 0 0 0 0 0 0 0 0.0122399 0 0 0 0 0 0 0.0110599 0 0 0 0.00178797 0 0 0.00183329 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.000722888 0.00676851 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00856402 0 0 0 0 0 0 0 0 0.0111477 0.00059376 0 0 0 0 0 0 0 0 0.00508324 0 0 0 0 0 0 0 0 0 0 0 0 0.0234093 0.000503709 0 0 0 0 0 0 0 0 0 0 0 0 0.00648667 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00366121 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00626325 0.00480794 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00431859 0 0 0 0 0 0 0 0 0 0.0177181 0 0 0 0 0 0 0 0 0.00939421 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0123458 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0139566 0 0 0 0 0 0 0 0.019443 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00653593 0 0 0 0 0 0 0 0.000197248 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00861728 0 0.00137105 0 0 0 0 0.0059969 0 0 0 0 0 0 0 0 0 0 0 0.0043041 0 0 0 0.00335044 0 0 0 0.000943719 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00794553 0 0 0 0 0 0 0 0 0.00637952 0 0 0 0 0 0.00576037 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00128415 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0322539 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00394267 0 3.17341e-05 0 0 0 0 0 0 0.00311994 0 0 0 0.000127388 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00248414 0 0 0 0 0 0 0 0 0.018184 0 0 0 0.00496907 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00448817 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00518799 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00130389 0 0 0 0 0.0019272 0 0 0 0 0 0 0 0 0.00974738 0 0.00380441 0.00543164 0 0.020982 0 0 0 0 0 0 0 0 0 0 0.0105823 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00869155 0 0 0 0 0 0 0.00029301 0 0 0 0 0 0 0 0 0 0 0 0.00801804 0 0 0 0 0 0 7.91257e-05 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0457033 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00100959 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0231507 0 0.00477936 0 0 0 0 0 0 0 0 0 0.0353905 0 0 0.00436766 0 0 0 0.000426152 0 0 0 0 0 0 0 0 0 0.00119205 0 0 0 0.00720142 0 0 0 0 0 0.00218429 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00479173 0 0 0 0 0 0 0 0.0123444 0 0 0 0 0 0 0 0.00677441 0 0 0.000858885 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00643063 0 0 0 0 0.0316795 0 0 0 0 0 0 0.0072388 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0454961 0 0 0 0 0 0 0 0 0 0.0192358 0 0 0.00703676 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00373618 0 0.0197915 0 0 0 0 0 0 0 0 0.00573458 0 0 0 0 0 0.0126174 0 0 0 0 0 0 0 0 0.00292649 0 0 0.0058357 0 0 0 0 0 0.00223181 0 0 0 0.00833497 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0188856 0 0 0 0.000101303 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00406243 0 0 0.0150648 0 0 0 0 0 0 0 0 0 0.000741727 0 0 0 0 0 0.0175217 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00482207 0 0 0 0 0 0 0 0 0 0 0.00267396 0 0 0 0.0171179 0 0 0 0 0 0 0.00656499 0 0 0 0 0 0.00266894 0 0 0 0.00564821 0 0 0 0 0.000221197 0.00478769 0 0 0 0 0 0 0 0.0112556 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0121466 0 0 0 0 0 0 7.94218e-05 0 0 0 0 0 0 0.00620171 0 0 0 0 0 0 0 0.0085413 0.00833934 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00246232 0 0.00108638 0 0 0 0 0 0 0 0 0 0 0 0 0.00108861 0 0 0 0 0 0 0 0 0 0 0.0100085 0 0.0024012 0 0 0 0.00752149 0.0116681 0.00720938 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.000290672 0 0 0.0100481 0 0 0 0 0 0 0.00168121 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0173791 0 0 0 0 0.00141686 0 0.00167449 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00754088 0 0 0 0 0 0.00123313 0 0 0 0 0 0.00335707 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00409493 0 0 0 0 0 0 0 0 0 0 0.0113777 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00251997 6.97293e-05 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00177757 0.0209727 0 0.00308079 0 0.00089276 0 0 0 0 0 0 0.000531637 0 0 0 0 0 0.0358833 0 0 0 0 0 0 0 0 0.00727786 0 0 0 0 0 0.00084223 0 0 0 0 0.00346543 0 0 0 0 0 0 0 0 0 0 0.00322787 0 0 0 0 0.00113456 0 0 0.002952 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.013897 0 0 0 0 0 0 0 0 0 0 0.00701712 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00274685 0 0 0 0 0 0 0 0 0 0.00162748 0 0.0071532 0 0 0 0 0 0 0 0 0 0.000288245 0 0.00270479 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0162539 0.0122745 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00583002 0 0 0 0 0 0 0 0 0 0 0 0 0.0089793 0 0 0 0 0.00696608 0 0 0 0.000293836 0 0 0 0 0 0.0035224 0 0 0 0 0 0 0 0 0 0.008572 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00165105 0 0 0.0174456 0 0 0 0 0.00243279 0 0 0 0 0 0 0 0.0341513 0 0 0 0 0 0 0 0 0 0 0 0 0.0205112 0 0.0136956 0 0 0 0 0 0 0.00757444 0 0 0 0 0.005163 0.0104851 0 0.03067 0 0 0 0 0 0 0 0 0 0.00282288 0 0 0 0 0 0 0 0 0 0 0 0.00166481 0 0 0 0 0 0 0 0 0 0 0 0 0 0.000841163 0 0 0.0137956 0 0 0 0 0 0 0 0 0.00349917 0 0 0 0 0 0 0 0 0.000907209 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00166667 0 0 0 0 0 0.00218781 0 0 0 0 0 0 0 0 0.00922062 0 0 0 0.00344503 0 0 0 0 0 0 0 0 0.0118425 0.0138607 0 0 0 0 0 0 0.0080263 0 0 0 0 0 0 0 0.00169018 0.00891775 0 0.008039 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0255294 0 0 0 0 0 0 0 0 0 0 0 0.00812194 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0249363 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0148788 0.0106359 0.00357627 0 0.000689257 0 0 0 0 0 0 0 0 0 0 0 0 6.35098e-05 0 0 0 0 0 0 0 0 0 0.0159978 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00299011 0 0 0 2.19797e-05 0 0 0 0 0.010961 0 0 0 0 0 0 0 0 0 0 0 0"
        val ds2 = "0 0 0 0 0 0.0018068 0 0 0 0 0 0 0.0108588 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0109462 0.00153121 0 0.0471695 0 0 0 0 0 0.0226042 0 0 0 0 0 0 0 0 0 0 0.00162854 0 0 0 0 0 0 0.00270892 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.023086 0 0 0 0 0 0 0 0 0.0028385 0 0 0 0 0.00175256 0 0.000182402 0 0 0 0 0 0.0102994 0 0.00726189 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.016592 0 0 0 0 0 0 0.0203188 0.0184191 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0160139 0 0 0 0 0 0 0 0 0 0 0 0.00319847 0 0 0 0 0 0 0 0 0 0 0 0 0.0366884 0 0 0 0 0 0 0 0 0 0 0 0.0158769 0 0 0 0 0 0.025955 0 0 0 0 0.00347195 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0127931 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00645757 0 0 0 0 0 0 0 0 0.0314158 0.005603 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00319499 0 0 0 0.00106635 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0242011 0 0 0 0 0 0 0 0 0.0132888 0 0 0 0 0 0 0 0 0 0.0033324 0 0 0 0 0.00363262 0 0 0 0 0 0 0 0.0173096 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0298752 0 0 0 0.0320833 0 0 0 0 0 0 0.00211459 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00712519 0 0 0 0 0 0 0.0261462 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0420125 0 0 0 0 0 0 0.00375033 0 0 0 0.00732831 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0013886 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00927926 0 0 0 0 0 0 0 0.0163314 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00875017 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.000394978 0 0 0 0 0.0144626 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0198433 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0118903 0.0265781 0 0 0 0 0.00171887 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.000682187 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0393586 0 0 0 0 0 0 0.0404626 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0236329 0 0 0 0 0 0 0.0182928 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0301615 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00631695 0 0 0 0 0 0 0 0 0 0.000995465 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00216187 0 0 0 0 0 0 0 0 0 0 0 0 0.00881533 0 0 0 0 0 0 0 0 0 0.000167816 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00189803 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0190043 0 0 0 0 0 0 0.0191012 0 0 0 0 0 0 0 0.0219326 0 0 0 0 0 0 0 0.000559327 0 0 0 0 0 0 0 0 0 0 0.0113317 0 0 0 0 0 0 0.00355951 0.0114738 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0263209 0 0 0 0 0 0 0 0.0264221 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0449189 0 0 0 0 0 0.0147946 0 0 0 0 0.0341321 0 0 0 0 0 0 0 0 0 0 0 0 0 0.015729 0 0.0297386 0 0 0 0 0 0 0 0 0 0 0 0.0334498 0 0 0 0 0 0 0 0 0.00368019 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 5.17869e-05 0 0 0.00304858 0.0212524 0 0 0 0.0147781 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00416911 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0100293 0 0 0 0 0 0 0 0 0 0 0 0 0.024856 0 0 0 0 0 0 0 0.0393091 0 0 0 0 0 0 0.0396545 0 0 0.00190728 0 0 0 0 0 0 0 0 0 0.00365615 0 0 0 0 0.00661538 0 0 0 0 0 0 0 0 0 0 0.0158032 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0217016 0.00402184 0 0 0 0 0 0.043735 0 0 0 0 0.0223405 0 0 0 0 0 0 0 0 0 0 0 0 0.0157728 0 0 0 0 0 0 0 0 0 0.00534457 0 0 0 0 0 0 0 0 0 0 0 0.00423866 0 0 0 0 0 0.00517575 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0113851 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0216584 0 0 0 0 0 0.00291376 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00400364 0 0.0328844 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0239485 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.000352955 0 0 0 0 0 0 0 0 0 0 0.0109378 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0126022 0 0 0 0 0 0 0 0 0 0 0 0.0158293 0.0247441 0 0 0 0 0 0.00651692 0 0 0 0.0367447 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00694218 0 0 0 0 0 0 0 0.00695514 0 0 0.0207199 0 0 0 0 0 0 0.00419857 0 0 0 0 0 0 0 0.0136075 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00261812 0.0459669 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 9.05341e-05 0 0 0.0143006 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00400845 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0126847 0.0156328 0 0 0 0 0 0.00754188 0 0 0 0 0 0 0 0 0.0216652 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00194092 0 0 0 0 0 0 0 0 0.0183505 0 0 0 0 0.00033638 0 0 0 0 0 0.00351179 0 0 0 0 0.0190296 0 0.002796 0 0 0 0.00223854 0 0.0252458 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.000914712 0 0 0 0 0 0.00205577 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00457164 0 0 0 0 0 0 0 0.000622622 0.00595419 0 0 0 0 0 0 0 0 0 0 0 0.0176146 0 0 0 0 0 0 0 0 0.027813 0 0 0 0 0 0 0 0 0 0.024928 0 0 0 0 0 0 0.0067005 0 0 0 0.00123602 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0066717 0 0 0 0 0 0.00089069 0 0 0 0.00973605 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0134763 0 0 0 0 0 0 0 0 0 0 0 0.00833639 0.0235413 0 0 0 0 0 0 0 0 0.0284396 0 0.00793354 0 0 0 0 0 0 0 0 0 0.032699 0 0 0 0.0120782 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0259734 0 0 0 0 0 0 0 0 0 0.0174119 0 0.0293867 0 0 0 0 0 0.00158565 0 0 0 0.00676878 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0112033 0 0 0.0114521 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0125544 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00997149 0 0 0 0 0 0 0 0 0 0 0.00201862 0 0 0 0 0 0 0 0 0 0 0.00218206 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00029872 0 0 0 0 0 0 0 0 0 0.00870713 0.00014447 0 0 0.0107598 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0203093 0 0.00980004 0 0 0 0 0 0 0 0 0 0 0.0209396 0 0 0 0 0 0 0 0 0.00394153 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0232484 0 0 0 0 0 0 0.0113856 0 0 0 0 0 0.0125761 0 0 0 0 0 0.00153854 0 0 0 0 0 0 0 0 0 0 0 0 0.00758953 0 0.00358174 0.00405798 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.000733919 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0343426 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0239134 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0119645 0 0 0 0.00624003 0 0.0287459 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0121292 0 0 0 0 0 0 0 0 0.0426114 0 0 0 0 0 0 0 0.0217729 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0209325 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0326381 0.0208721 0 0 0 0 0 0 0.00184065 0 0 0.0222558 0.00148117 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0358877 0 0 0 0 0 0.0155037 0.00421872 0.00513766 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0307409 0 0 0 0 0 0 0 0 0 0 0.0147909 0 0 0 0 0 0.00170888 0 0.0016167 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00165883 0 0 0 0 0 0 0 0.0118213 0 0 0 0 0 0 0 0 0 0.041745 0 0 0 0 0 0 0 0 0 0 0.0201311 0 0 0.0253722 0 0 0 0 0 0 0.0143077 0 0 0 0 0 0 0 0 0 0 0 0 0.00142362 0 0 0 0.00437765 0 0 0 0 0 0 0 0.0113638 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00266949 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0114284 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00425102 0.00764314 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0172507 0 0 0 0 0 0 0.015378 0 0 0 0 0 0.0019062 0 0 0.00937673 0 0 0 0.00743992 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00299888 0 0.0108985 0 0 0 0 0.000634009 0 0.00698096 0 0 0 0 0.00487492 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 8.28423e-05 0 0.0279883 0 0 0.00342555 0 0 0 0 0.0130169 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00311727 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0177929 0 0 0 0 0.00765765 0 0 0 0 0 0 0 0 0 0 0 0 0.00584551 0 0 0 0 0 0 0 0 0.0477912 0 0 0.0261295 0 0 0 0.00655313 0 0.0319028 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00647484 0 0 0 0 0 0 0 0.0252361 0 0.0210559 0.000873765 0 0 0.0270875 0.000204343 0 0 0 0 0.00724107 0 0.0110595 0 0 0.018931 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0433719 0 0 0 0 0 0 0.0137977 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.000584244 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0253709 0 0 0 0 0 0.000372603 0.0143449 0 0 0 0.0114476 0.00613833 0 0 0.0242346 0 0 0 0 0 0 0.0165346 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0152293 0.00590556 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0075514 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00398737 0.000230545 0 0 0 0.00083377 0.0295825 0 0.0110554 0.00762996 0 0 0 0 0 0 0 0 0 0 0 0.0202061 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00295296 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0170548 0 0 0.00354946 0.0170217 0.0265475 0 0.00398216 0 0 0.02028 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0145604 0.0239672 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0262676 0 0 0 0 0 0.0342029 0 0 0.01249 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00973619 0 0 0 0 0 0 0 0.0185824 0 0 0 0 0 0 0 0 0 0 0.0150242 0 0 0.00145245 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0087628 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00606968 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0342178 0 0 0.0179857 0 0 0 0 0 0 0 0 0 0 0 0.000675984 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0134154 0 0.034685 0 0 0 0 0.0643373 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0042544 0 0 0.012405 0 0 0 0 0 0 0 0 0 0 0 0 0.0204176 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00861185 0 0 0 0 0 0 0 0 0.00803161 0 0 0 0 0 0 0 0 0 0 0 0 0.0141929 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.000974571 0 0 0.002366 0.00651334 0 0 0 0 0 0 0 0 0.00871145 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.01497 0 0 0 0.00216168 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0421663 0.0269427 0 0 0 0 0 0 0 0 0 0 0.0183308 0 0.00519691 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0408526 0 0 0 0.00715041 0 0 0.00995387 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00429291 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.014422 0.00948602 0 0 0 0 0 0 0 0 0 0.00317736 0 0 0 0.000749063 0 0 0 0.0241993 0 0 0.0028395 0 0 0 0 0 0 0.00896639 0 0 0 0 0 0 0 0 0 0 0 0.00926106 0 0 0 0 0 0 0 0 0 0 0.0122596 0 0 0 0 0 0 0 0 0.0138407 0 0.0263351 0 0 0 0 0 0 0 0 0 0 0 0 0.0054054 0 0 0 0.0130486 0 0.00416973 0 0 0 0 0 0 0 0 0.0114262 0 0 0 0 0 0 0 0 0 0.03234 0 0 0 0 0 0 0 0 0.00219943 0.0075999 0.00444042 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0190936 0 0 0 0 0.00725805 0 0 0 0 0 0 0 0 0 0.0145989 0 0 0 0 0 0 0.00564812 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0223728 0 0 0 0 0 0 0.0161154 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0266693 0 0 0 0 0 0 0.0152155 0.000897274 0 0 0 0 0 0 0 0 0.00801452 0.0214714 0 0 0 0 0.0357905 0.01601 0 0 0 0 0 0.00862417 0 0 0 0 0 0 0 0 0 0.000292665 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00209432 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00282366 0 0 0 0 0 0 0 0 0 0.00100581 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0301452 0 0 0 0 0 0 0.00204545 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00426865 0 0 0 0 0.0197504 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00874624 0 0 0 0 0 0 0 0 0 0 0 0 0 0.0121412 0 0 0.00277861 0 0 0 0 0.00689127 0 0 0 0.0402764 0 0 0.00422278 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.00493623 0 0 0 0 0 0 0 0 0 0 0.0295458 0 0 0 0"

        val userSource = ds1.split(" ").map(_.toDouble).toVector
        val baseSource = ds2.split(" ").map(_.toDouble).toVector

        val member = userSource.zip(baseSource)
                .map(d => d._1 * d._2).reduce(_ + _)
                .toDouble

        val temp1 = math.sqrt(userSource.map(num => {
            math.pow(num, 2)
        }).reduce(_ + _))

        val temp2 = math.sqrt(baseSource.map(num => {
            math.pow(num, 2)
        }).reduce(_ + _))

        val denominator = temp1 * temp2

        val rate = (member / denominator)
        println("rate=" + rate)

    }

}