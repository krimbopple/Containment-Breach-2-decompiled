Function GUESSEDsettx%(arg0%)
    Local local0%
    Local local1%
    Local local2.doors
    Local local3%
    local0 = blitz_TX28D20DD080()
    local1 = blitz_TX28D20DD080()
    If (ReadBool(local1, $03) <> 0) Then
        local3 = (blitz_TX28D20DD080() - $80)
    EndIf
    local2 = Z22B2BXD2[arg0]
    If (local2 <> Null) Then
        local2\Field48 = local0
        local2\Field29 = local1
        local2\Field15 = local3
        local2\Field50 = 0.0
    EndIf
    Return $00
End Function
