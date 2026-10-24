Function CreateLight%(arg0%, arg1%)
    Local local0.TX64X4ZXXX0
    local0 = (New TX64X4ZXXX0)
    local0\Field7 = createpivot(arg1)
    local0\Field9 = arg0
    local0\Field2 = 1.0
    local0\Field5 = $FF
    local0\Field8 = $FF
    local0\Field4 = $FF
    local0\Field1 = 10.0
    local0\Field3 = 90.0
    entitydestructor(local0\Field7, FuncPtr(EXF822208))
    Return local0\Field7
    Return $00
End Function
