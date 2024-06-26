package com.reltio.datapipelinehub.workflow;

import java.util.*;

class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates == null || candidates.length == 0) {
            return null;
        }

        Set<List<Integer>> result = new HashSet<>();
        combinationSum(candidates, target, 0, new ArrayList<>(), result);
        return new ArrayList<>(result);
    }

    private void combinationSum(int[] candidates,
                                int target,
                                int curSum,
                                List<Integer> list,
                                Set<List<Integer>> result) {
        if (curSum == target) {
            List<Integer> newList = new ArrayList<>(list);
            Collections.sort(newList);
            result.add(newList);
            return;
        }
        if (curSum > target) {
            return;
        }

        for (int i = 0; i < candidates.length; i++) {
            list.add(candidates[i]);
            combinationSum(candidates, target, curSum + candidates[i], list, result);
            list.remove(list.size() - 1);
        }
    }

  
}