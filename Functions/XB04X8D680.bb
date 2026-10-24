Function XB04X8D680%()
    Local local0#
    If (loadingimage = $00) Then
        Return $00
    EndIf
    local0 = min((T8ZB864XB0 + AZ4Z48BBX), (Float E2F4Z648F))
    If (E2F4Z648F = $00) Then
        renderloading(T8ZB864XB0, X4Z088FBZ0, E2F4Z648F, AZ4Z48BBX)
    Else
        renderloading(local0, X4Z088FBZ0, E2F4Z648F, AZ4Z48BBX)
    EndIf
    Return $00
End Function
