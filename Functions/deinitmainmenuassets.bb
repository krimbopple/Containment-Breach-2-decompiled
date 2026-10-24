Function deinitmainmenuassets%()
    Local local0.XZ8B4B628
    freeentity(T42DZ064FB\Field8)
    For local0 = Each XZ8B4B628
        freeentity(local0\Field3)
        Delete local0
    Next
    freeimage(mma\Field1)
    mma\Field1 = $00
    freeimage(mma\Field0)
    mma\Field0 = $00
    freeimage(mma\Field4)
    mma\Field4 = $00
    freeimage(mma\Field3)
    mma\Field3 = $00
    freeimage(mma\Field2)
    mma\Field2 = $00
    freeimage(mma\Field5)
    mma\Field5 = $00
    Delete mma
    mma = Null
    Delete T42DZ064FB
    T42DZ064FB = Null
    Return $00
End Function
