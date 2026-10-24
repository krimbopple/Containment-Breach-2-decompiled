Function T2X44BXFXX%(arg0.events)
    Local local0.TX2BF6X0FF4
    If (arg0\Field5 <> Null) Then
        local0 = (After arg0\Field5)
    EndIf
    local0 = C4D8Z6266(arg0, local0)
    If (local0 = Null) Then
        local0 = C4D8Z6266(arg0, (First TX2BF6X0FF4))
    EndIf
    arg0\Field5 = local0
    If (arg0\Field5 = Null) Then
        arg0\Field5 = TXXF6F02DB2[TXXDZB2ZBXX()]
    EndIf
    Return $00
End Function
