Function removewearableitems%(arg0.items)
    Select arg0\Field6\Field9
        Case $38,$39,$3A,$3B
            T8660BZ460\Field3 = $00
        Case $22,$23
            i_1499\Field8 = $00
        Case $26
            T8660BZ460\Field7 = $00
        Case $27,$28
            T8660BZ460\Field6 = $00
        Case $3C,$3D,$3E,$3F
            T8660BZ460\Field10 = $00
        Case $0B,$0C,$0D
            i_268\Field2 = $00
        Case $12
            i_427\Field2 = $00
        Case $19,$18
            i_714\Field0 = $00
    End Select
    Return $00
End Function
