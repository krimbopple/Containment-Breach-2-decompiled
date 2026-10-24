Function TD0F2FZBXZ%(arg0$, arg1%, arg2%, arg3%)
    Local local0.XB2D08Z642
    Local local1%
    Local local2.XB2D08Z642
    local1 = Z2XBX862F(arg0)
    If (local1 = $00) Then
        Return $00
    EndIf
    For local2 = Each XB2D08Z642
        If (((local2\Field0 = local1) And (local2\Field1 = arg1)) <> 0) Then
            local0 = local2
            Exit
        EndIf
    Next
    If (local0 = Null) Then
        local0 = (New XB2D08Z642)
        local0\Field0 = local1
        local0\Field1 = arg1
        local0\Field3 = TXB2266Z0X0($00)
    EndIf
    If (arg3 = $00) Then
        local0\Field4 = $00
        local0\Field6 = millisecs()
        If (local0\Field5 = $00) Then
            local0\Field5 = millisecs()
        EndIf
        C2DFF2ZD0\Field3 = local1
        C2DFF2ZD0\Field2 = arg1
        writeint(C2DFF2ZD0\Field0, $7FFF03)
        writebyte(C2DFF2ZD0\Field0, arg2)
        sendudpmsg(C2DFF2ZD0\Field0, local1, arg1)
    Else
        local0\Field2 = (millisecs() + arg3)
    EndIf
    Return $01
    Return $00
End Function
