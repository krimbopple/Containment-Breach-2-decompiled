Function XZF4X2066X$(arg0%)
    Local local0%
    Local local1%
    Local local2%
    Local local3$
    local0 = ((arg0 Shr $10) And $FF)
    local1 = ((arg0 Shr $08) And $FF)
    local2 = ((arg0 Shr $00) And $FF)
    local3 = (((Str local0) + ".") + (Str local1))
    If (local2 > $00) Then
        local3 = ((local3 + ".") + (Str local2))
    EndIf
    Return local3
    Return ""
End Function
