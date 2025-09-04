class Solution {
    public int findClosest(int x, int y, int z) {
        int dXZ = Math.abs(x - z);
        int dYZ = Math.abs(y - z);
        if(dXZ == dYZ) return 0;
        return (dXZ < dYZ)? 1 : 2;
    }
}