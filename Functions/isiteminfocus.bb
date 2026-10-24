Function isiteminfocus%()
    Select selecteditem\Field6\Field9
        Case $49,$4A,$4B,$4C,$00,$01,$03,$04,$1E,$1F,$4D,$4E,$4F
            Return $01
    End Select
    Return $00
    Return $00
End Function
