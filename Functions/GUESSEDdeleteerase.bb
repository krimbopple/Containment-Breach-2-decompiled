Function GUESSEDdeleteerase%(arg0%, arg1%, arg2.T6068XB4Z2, arg3%)
    Local local0.TF2886ZFB2
    Local local1%
    If (GUESSEDupdateanimatenpc() <> 0) Then
        local0 = (New TF2886ZFB2)
        local0\Field0 = arg0
        local0\Field1 = arg1
        local0\Field2 = arg3
        local1 = _IntVectorFind(T2X0XXBX084\Field0[arg0], arg2)
        If (local1 >= $00) Then
            _IntVectorErase(T2X0XXBX084\Field0[arg0], local1)
        EndIf
    EndIf
    _I2IMapErase(T2X0XXBX084\Field1[arg0], arg1)
    Return $00
End Function
