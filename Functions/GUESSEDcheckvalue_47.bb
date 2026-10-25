Function GUESSEDcheckvalue_47%(arg0.TX2BF6X0FF4, arg1%)
    Local local0%
    Local local1%
    If (((GUESSEDupdateanimatenpc() = $00) Lor (arg0\Field55\Field12 <> $00)) <> 0) Then
        Return $00
    EndIf
    local0 = arg0\Field55\Field21
    local1 = arg0\Field55\Field16
    GUESSEDcheckvalue_19(arg0, arg1, $00)
    arg0\Field55\Field12 = local0
    arg0\Field55\Field4 = local1
    Return $00
End Function
