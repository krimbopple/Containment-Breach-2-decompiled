Function GUESSEDcreateint.TX2BF6X0FF4(arg0%, arg1%, arg2%)
    Local local0.TX2BF6X0FF4
    If (TXXF6F02DB2[arg0] <> Null) Then
        Return Null
    EndIf
    local0 = (New TX2BF6X0FF4)
    local0\Field13 = arg0
    local0\Field7 = arg1
    local0\Field25 = arg2
    local0\Field55 = (New EZZ00XD2)
    If (GUESSEDupdateanimatenpc() <> 0) Then
        local0\Field46 = GUESSEDcreatedeque_2()
    EndIf
    GUESSEDsetfield_18(local0)
    GUESSEDsetchannel(local0)
    GUESSEDcopyentity_4(local0)
    GUESSEDcreateentity_9(local0)
    GUESSEDcreatetahoma(local0)
    GUESSEDupdateobjects(local0)
    GUESSEDcreateentity(local0)
    GUESSEDcreatedeque(local0)
    If (GUESSEDupdateanimatenpc() <> 0) Then
        Steam_GetUInt64(local0, _Steam_GetUInt64String(arg1, arg2))
    EndIf
    local0\Field9 = $01
    local0\Field4 = $01
    TXXF6F02DB2[arg0] = local0
    Return TXXF6F02DB2[arg0]
    Return Null
End Function
