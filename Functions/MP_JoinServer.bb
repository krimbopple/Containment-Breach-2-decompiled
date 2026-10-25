Function MP_JoinServer.TX2BF6X0FF4(arg0$)
    Local local0.TX2BF6X0FF4
    Local local1.ED844B0F6
    local0 = GUESSEDcreateint(GUESSEDupdateobjects_13(), GUESSEDcounthost("localhost"), $7530)
    If (local0 <> Null) Then
        local0\Field2 = $20105
        local0\Field27 = arg0
        GUESSEDsendobjectstate(local0)
        GUESSEDcheckvalue_43(format(getlocalstring("broadcast", "joined"), local0\Field27, "%s"))
        GUESSEDsetglobal_9($01)
        local1 = (New ED844B0F6)
        local1\Field0 = local0
    EndIf
    Return local0
    Return Null
End Function
