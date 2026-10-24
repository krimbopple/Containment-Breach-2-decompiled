Function X622X42Z04%()
    Local local1%
    Local local2%
    Select blitz_TX28D20DD080()
        Case $01
            Repeat
                local1 = blitz_TX28D20DD080()
                If (local1 = $00) Then
                    Exit
                EndIf
                TXXX66X2686(local1)
            Forever
        Case $02
            Repeat
                local2 = blitz_XXXBBZ4F2Z0()
                If (((local2 = $00) Lor (local2 >= $3E8)) <> 0) Then
                    Exit
                EndIf
                T2X4ZXF6XBB(local2)
            Forever
    End Select
    Return $00
End Function
