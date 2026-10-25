Function GUESSEDisentity_10%(arg0.TX2BF6X0FF4, arg1$, arg2%, arg3#, arg4#)
    Local local0#
    Local local1#
    Local local2#
    Local local3.TX2BF6X0FF4
    If (((((arg2 = $00) Lor (GUESSEDupdatexdb() = $00)) Lor (GUESSEDupdateanimatenpc() = $00)) Lor (arg1 = "")) <> 0) Then
        Return $00
    EndIf
    local0 = entityx(arg2, $01, 1.0)
    local1 = entityy(arg2, $01, 1.0)
    local2 = entityz(arg2, $01, 1.0)
    For local3 = Each TX2BF6X0FF4
        If ((((local3\Field13 > $01) And (arg0 <> local3)) And ((arg3 * 1.25) > distance(local0, entityx(local3\Field52, $00, 1.0), local1, entityy(local3\Field52, $00, 1.0), local2, entityz(local3\Field52, $00, 1.0)))) <> 0) Then
            GUESSEDtxxffunc(local3, arg1, $01, $00, arg3, arg4, local0, local1, local2)
        EndIf
    Next
    Return $00
End Function
