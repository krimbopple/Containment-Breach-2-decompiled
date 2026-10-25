Function GUESSEDupdateitems%(arg0.items)
    If (GUESSEDupdateanimatenpc() = $00) Then
        Return $00
    EndIf
    Return GUESSEDisentity_4(arg0\Field9, 250.0)
    Return $00
End Function
