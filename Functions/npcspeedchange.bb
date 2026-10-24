Function npcspeedchange%(arg0.npcs)
    Select arg0\Field77
        Case $08,$07,$06,$03,$0D,$0A
            Select selecteddifficulty\Field8
                Case $01
                    arg0\Field32 = (arg0\Field32 * 1.1)
                Case $02
                    arg0\Field32 = (arg0\Field32 * 1.2)
                Case $03
                    arg0\Field32 = (arg0\Field32 * 1.3)
            End Select
    End Select
    Return $00
End Function
