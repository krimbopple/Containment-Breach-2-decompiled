Function rendermenuticks%()
    Local local0.menutick
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    Local local5%
    Local local6%
    Local local7%
    local1 = (Int (20.0 * menuscale))
    local2 = (Int (20.0 * menuscale))
    For local0 = Each menutick
        If (local0\Field1 <> 0) Then
            color($64, $64, $64, $FF)
        Else
            color($FF, $FF, $FF, $FF)
        EndIf
        rect(local0\Field3, local0\Field0, local1, local2, $01)
        local4 = mouseon(local0\Field3, local0\Field0, local1, local2)
        local5 = ($32 * local4)
        local6 = ($32 * local4)
        local7 = ($32 * local4)
        color(local5, local6, local7, $FF)
        rect((local0\Field3 + $01), (local0\Field0 + $01), (local1 - $02), (local2 - $02), $01)
        If (local0\Field2 <> 0) Then
            If (local4 <> 0) Then
                local5 = $C8
                local6 = $C8
                local7 = $C8
            Else
                local5 = $FA
                local6 = $FA
                local7 = $FA
            EndIf
            color(local5, local6, local7, $FF)
            rect((local0\Field3 + $02), (local0\Field0 + $02), (local1 - $04), (local2 - $04), $01)
        EndIf
        color($FF, $FF, $FF, $FF)
    Next
    Return $00
End Function
