Function GUESSEDisdateevent%()
    Local local0$
    Local local1%
    local0 = right(left(currentdate(), $06), $03)
    local1 = (Int left(currentdate(), $02))
    Select local0
        Case "Dec"
            If (((local1 >= $03) And (local1 <= $1F)) <> 0) Then
                Return $01
            EndIf
        Case "Jan"
            If (((local1 >= $01) And (local1 <= $04)) <> 0) Then
                Return $01
            EndIf
    End Select
    Return $00
    Return $00
End Function
