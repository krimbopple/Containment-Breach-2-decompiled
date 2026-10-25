Function GUESSEDcopyentity_3%(arg0.TX2BF6X0FF4, arg1%)
    Local local0.EZZ00XD2
    Local local1.X62B24X2FD
    Local local2.TB86B8F2BX
    Local local3%
    local0 = arg0\Field55
    local1 = local0\Field3[arg1]
    GUESSEDfreeentity_9(arg0, arg1, $00)
    local1\Field5 = local1\Field3
    GUESSEDsetfield_20(arg0)
    If (local0\Field7 = $00) Then
        Return $00
    EndIf
    If (local1\Field5 = Null) Then
        Return $00
    EndIf
    local2 = GUESSEDgetarg1_2(local0, local1\Field5)
    If (((local2 = Null) Lor (local1\Field5\Field0[local2\Field6] = $00)) <> 0) Then
        Return $00
    EndIf
    local3 = findchild(local0\Field7, local2\Field5)
    If (local3 = $00) Then
        Return $00
    EndIf
    If (local1\Field5\Field9[local2\Field6] <> "") Then
        local1\Field2 = copyentity(local1\Field5\Field0[local2\Field6], local3)
    Else
        local1\Field2 = GUESSEDcopyentity_2(local1\Field5\Field0[local2\Field6], local3)
    EndIf
    positionentity(local1\Field2, local2\Field0, local2\Field2, local2\Field1, $00)
    rotateentity(local1\Field2, local2\Field8, local2\Field4, local2\Field3, $00)
    scaleentity(local1\Field2, local2\Field7, local2\Field7, local2\Field7, $00)
    If (local1\Field5\Field9[local2\Field6] <> "") Then
        entitytexture(local1\Field2, loadtexture_strict(local1\Field5\Field9[local2\Field6], $01, $01, 1.0), $00, $00)
        GUESSEDfreeentity_7(local1\Field2, $FFFFFFFF, $00)
    EndIf
    Return $01
    Return $00
End Function
