Function GUESSEDcopybank%(arg0%, arg1%, arg2%)
    GUESSEDscalebank(F2648FXXF\Field0, arg1)
    copybank(arg0, arg2, F2648FXXF\Field0\Field3, F2648FXXF\Field0\Field2, arg1)
    F2648FXXF\Field0\Field2 = (F2648FXXF\Field0\Field2 + arg1)
    Return $00
End Function
